/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Comparator;

/**
 *
 * @author 84393
 */
 public class priceComparator implements Comparator<Goods> {
    @Override
    public int compare(Goods goods1, Goods goods2) {
        return Double.compare(goods1.getDongia(), goods2.getDongia());
    }
}
