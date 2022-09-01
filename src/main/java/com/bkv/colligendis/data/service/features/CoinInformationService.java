package com.bkv.colligendis.data.service.features;

import com.bkv.colligendis.data.entity.piece.CoinComment;
import com.bkv.colligendis.data.entity.piece.CoinInformation;
import com.bkv.colligendis.data.entity.piece.CoinVariant;
import com.bkv.colligendis.data.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class CoinInformationService extends AbstractService<CoinInformation, CoinInformationRepository> {

    private final CoinVariantRepository coinVariantRepository;
    private final CoinCommentRepository coinCommentRepository;

    public CoinInformationService(CoinInformationRepository repository,
                                  CoinVariantRepository coinVariantRepository,
                                  CoinCommentRepository coinCommentRepository) {
        super(repository);
        this.coinVariantRepository = coinVariantRepository;
        this.coinCommentRepository = coinCommentRepository;
    }

    public CoinInformation findByNumistaNumber(String numistaNumber){
        return repository.findByNumistaNumber(numistaNumber).block();
    }

    public boolean deleteExistCoinVariants(CoinInformation coinInformation){
        if(coinInformation.getCoinVariants().size() > 0){
            for(CoinVariant coinVariant : coinInformation.getCoinVariants()){
                coinVariantRepository.delete(coinVariant).block();
            }
            coinInformation.getCoinVariants().clear();
//            repository.save(coinInformation).block();
            return true;
        }
        return false;
    }
//    public boolean deleteExistComments(CoinInformation coinInformation){
//        if(coinInformation.getCoinComments().size() > 0){
//            for(CoinComment coinComment : coinInformation.getCoinComments()){
//                coinCommentRepository.delete(coinComment).block();
//            }
//            coinInformation.getCoinComments().clear();
////            repository.save(coinInformation).block();
//            return true;
//        }
//        return false;
//    }

}
