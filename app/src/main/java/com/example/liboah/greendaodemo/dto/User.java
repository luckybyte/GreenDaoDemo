package com.example.liboah.greendaodemo.dto;

import org.greenrobot.greendao.annotation.Entity;

/**
 * Created by liboah on 2017/8/8.
 */

@Entity
public class User {

    private Long id;

    private String name;

    private int tempUsageCount;
}
