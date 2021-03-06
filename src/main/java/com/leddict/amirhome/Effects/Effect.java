package com.leddict.amirhome.Effects;

import com.leddict.amirhome.Colors.HSBColor;

public abstract class Effect<ConfigClass extends EffectConfiguration> {

    public Effect(HSBColor colorsArray[]) {
        this.colorsArray = colorsArray;
    }

    public abstract void apply(double timePercent, Integer beatIndex);
    public void setConfig(ConfigClass config) {
        this.config = config;
    }

    protected final HSBColor colorsArray[];

    public ConfigClass config;
}
