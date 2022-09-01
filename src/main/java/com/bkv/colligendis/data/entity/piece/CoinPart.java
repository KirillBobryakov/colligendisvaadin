package com.bkv.colligendis.data.entity.piece;

import com.bkv.colligendis.data.entity.AbstractEntity;
import org.springframework.data.neo4j.core.schema.Node;

@Node("COIN_SIDE")
public class CoinPart extends AbstractEntity {

    private COIN_PART_TYPE sideType;

    private String photoLink;
    private String description;

    private String script;
    private String lettering;
    private String unabridgedLegend;
    private String translation;

    private String engraver;
    private String designer;

    public CoinPart(COIN_PART_TYPE sideType) {
        this.sideType = sideType;
    }

    public COIN_PART_TYPE getSideType() {
        return sideType;
    }

    public void setSideType(COIN_PART_TYPE sideType) {
        this.sideType = sideType;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getLettering() {
        return lettering;
    }

    public void setLettering(String lettering) {
        this.lettering = lettering;
    }

    public String getUnabridgedLegend() {
        return unabridgedLegend;
    }

    public void setUnabridgedLegend(String unabridgedLegend) {
        this.unabridgedLegend = unabridgedLegend;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getEngraver() {
        return engraver;
    }

    public void setEngraver(String engraver) {
        this.engraver = engraver;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }
}
