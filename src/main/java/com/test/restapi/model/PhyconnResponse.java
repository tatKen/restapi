package com.test.restapi.model;

import java.io.Serializable;

public class PhyconnResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fromCardType;
    private String fromCardName;
    private String fromPortName;
    private String fromCardFloor;
    private String toCardType;
    private String toCardName;
    private String toPortName;
    private String toCardFloor;
}
