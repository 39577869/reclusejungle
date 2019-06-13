package com.elcusejungle.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmailUtil implements Serializable {
    String code;
    String Address;
}
