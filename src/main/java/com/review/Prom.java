package com.review;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class Prom {
    public enum prom{
        G,
        H,
        J,
        K,
        N;
    }

    private prom prom;
    public Prom(prom prom){
        this.prom = prom;
    }
}
