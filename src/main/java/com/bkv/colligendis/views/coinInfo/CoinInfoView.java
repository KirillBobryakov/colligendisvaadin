package com.bkv.colligendis.views.coinInfo;

import com.bkv.colligendis.data.entity.piece.CoinInformation;
import com.bkv.colligendis.utils.numista.NumistaLoader;
import com.bkv.colligendis.data.service.ServiceUtils;
import com.bkv.colligendis.views.MainLayout;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@PageTitle("Coin Info")
@Route(value = "coin_info", layout = MainLayout.class)
@AnonymousAllowed
public class CoinInfoView extends HorizontalLayout {

    private final ServiceUtils serviceUtils;
    private TextField numistaTextField;
    private Button sayHello;


    public CoinInfoView(ServiceUtils serviceUtils) {
        this.serviceUtils = serviceUtils;


        numistaTextField = new TextField("Your name");
        numistaTextField.setValue("1");
        sayHello = new Button("Load");
        sayHello.addClickListener(e -> {
            int numistaNumber = Integer.parseInt(numistaTextField.getValue());

            for(int i = 1; i < 11; i++){

                NumistaLoader.getInstance(serviceUtils).loadNumistaPiece(String.valueOf(numistaNumber));
                numistaNumber++;
            }
            numistaTextField.setValue(String.valueOf(numistaNumber));
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, numistaTextField, sayHello);

        add(numistaTextField, sayHello);
    }

}
