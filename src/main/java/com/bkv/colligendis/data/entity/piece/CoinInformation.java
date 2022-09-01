package com.bkv.colligendis.data.entity.piece;


import com.bkv.colligendis.data.entity.features.COIN_TYPE;
import org.springframework.data.neo4j.core.schema.Node;

@Node("COIN_INFO")
public class CoinInformation extends PieceInformation{

    private COIN_TYPE coinType;


    public COIN_TYPE getCoinType() {
        return coinType;
    }

    public void setCoinType(COIN_TYPE coinType) {
        this.coinType = coinType;
    }
}
