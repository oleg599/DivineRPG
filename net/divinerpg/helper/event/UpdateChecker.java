package net.divinerpg.helper.event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import net.divinerpg.Reference;

public class UpdateChecker {
	
	public static boolean isUpdateAvailable() throws IOException, MalformedURLException 
    {
            BufferedReader versionFile = new BufferedReader(new InputStreamReader(new URL("https://dl.dropboxusercontent.com/s/xddtt5g4g8xz1ut/DivineRPG1.7Update.txt").openStream()));
            String curVersion = versionFile.readLine();

            versionFile.close();

            if (!curVersion.contains(Reference.MOD_VERSION))
            {
                    return true;
            }

            return false;
    }

}
