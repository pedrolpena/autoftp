/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoftp;
import java.io.*;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTP;
import java.net.SocketException;

/**
 *
 * @author pena
 */
public class DownloadIt {
    FTPClient ftp;
    File localFile;
    String remoteFile;
    boolean dirExists;
    AutoFTP autoFTPClass;
    SocketFactoryForFTPClient ssf;    
    
}
