package com.liuying.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Ͷ(TenderProjectInfo)实体类
 *
 * @author makejava
 * @since 2020-10-05 14:34:18
 */
@Data
public class TenderProjectInfo implements Serializable {
    private static final long serialVersionUID = -31281862857913736L;
    /**
    * Ͷ
    */
    private Integer id;
    
    private String projectName;
    
    private String projectIntrduce;
    
    private String projectAddress;
    
    private String projectType;
    
    private String projectNature;
    
    private String bidder;

    private Date pretenderDate;

    private Double pretenderFee;

    private Double pretenderAmount;
    
    private Double pretenderCapital;
    
    private String buildCompany;
    
    private String contactor;
    
    private String contactPhone;
    
    private String designCompany;
    
    private String superviderCompany;
    
    private String comment;

    private String creator;

    private Object createDate;
    
    private Integer flowId;
    
    private String approveStatus;


   }