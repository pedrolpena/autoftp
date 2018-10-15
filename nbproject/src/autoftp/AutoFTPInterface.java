/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoftp;

/**
 *
 * @author pena
 */
public interface AutoFTPInterface {

    public void downloadFiles(String filenames);
    public boolean getDirExists();
    public void setDirExists(boolean b);
    public void statusMessage(String status);
}
