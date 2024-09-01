package edu.spring_boot_railway.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/*
 * -Esta classe extends a classe BAseItem pois está utilizando
 * o conceito de DRY - (Don't Repeat Yourself/não repetir código).
 */
@Entity
@Table(name = "tb_feature")
public class Feature extends BaseItem {

}
