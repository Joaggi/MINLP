/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minlp.stream;

/**
 *
 * @author marcio
 */
public interface Consumer {
    public void accept(Integer t) throws Exception;
}
