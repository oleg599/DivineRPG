DivineRPG
=========

Official 1.7.2 DivineRPG Repository

###NOTICE BOARD
***
####CODE IS GOING THROUGH A REWRITE
Currently the code for the mod may contain several errors, as I (BossLetsPlays) am currently rewritting a large portion of the code for the following reasons.

1. Currently the code is simply too mesy, which is why it takes months and months for what should be a simple update
2. Not going to name names, but some people on the team are complete idiots and have know idea what they are doing
    * Appologies if you think you may be one of these people, but this madness has gone on for too long
        * You know who you are, and you know what madness I'm referring to
3. In the future after the rewrite, even major updates will take anywhere between 30 minutes to a week at most
4. As a side note, please refrain from making major changes to the code while I am in this process, and do not fix any errors I have created unless you know 500% what you are doing. The errors I am creating are done intentionally to remind myself what must be changed. Any new classes during or after my rewrite process will be deleted if it contains any nonsense code such as parameters or functions being named func_324_fwe, or likewise. If it is an overriden method, you are expected to create a helper method that is properly named, and place the code in there and then call that method in the overriden function rather than putting the code in the function named method.

####Important Links
1. [DivineRPG Website] (http://wiki.divinerpg.net)
2. [BossLetsPlays' Channel] (http://www.youtube.com/BossLetsPlays)

###Credits
***
####Developers
These are all the people involved in the actual programming of the mod.

1. The_Slayer
2. BossLetsPlays
3. SoccerStud
4. TLHPoE (fgt)

####Modelers
These people contribute textures and models.

1. BlueEyes9
2. Declan (UKDeccy)

###Contributing
***

####Setting Up in Eclipse
See "Sebmitting a Pull Request" if you do not have permissions to edit the GitHub.

#####Cloning

1. Clone Git
	* Window > Show View > Other... > Git > Git Repositories > OK
	* In the new "Git Repositories" view, click the icon with the yellow background and the blue arrow (http://prntscr.com/3j042b)
	* Copy this without the quotes "https://github.com/TheSlayerMC/DivineRPG.git" into the URI line,
	* Enter you GitHub username and password
	* Click next twice
	* Click "browse" and choose where you want the source stored.
	* Click finish
2. Create a new project

#####Setting Up

3. Right click project
4. Go to "Build path > Configure build path"
5. Delete the default "src" folder
6. Click "Add Folder"
7. Click "Create New Folder"
8. Folder name: "src/main/java"
9. Click "Create New Folder" again while the src folder is highlighted
10. Folder name: "main/resources"
11. Click "OK"
12. Add the Minecraft project to the build path
13. Click "OK"
14. Navigate to the git repo in file explorer
15. In that, go into main > java.
16. Drag the "net" and "com" folders into eclipse onto src/main/java
17. Check "Link to files and folders"
18. Do the same for main > resources > assets, this time draging it to src/main/resources

#####Pushing
19. Right click the "DivineRPG" in the Git view.
20. Click "Push"
21. Type your username and password if it asks.

####Submitting a Pull Request
Want to help improve our code? Fix bugs? Add to the mod? Make artistic improvements for us?

1. If you haven't already, create a Github account.
2. Click the `Fork` icon located at the top-right of this page (below your username).
3. Make the changes that you want to and commit them.
	* If you're making changes locally, you'll have to do `git commit -a` and `git push` in your command line.
4. Click `Pull Request` at the right-hand side of the gray bar directly below your fork's name.
5. Click `Click to create a pull request for this comparison`, enter your Pull Request's title, and write a detailed description telling us what you changed.
6. Click `Send pull request`, and be patient, we will review your changes

####Creating an Issue
Found a bug in our mod?  Please let us know so we can fix it ASAP!

1. Make sure your issue hasn't already been answered or fixed.  Also think about whether your issue is a valid one before submitting it.
2. Go to [the issues page](http://github.com/TheSlayerMC/DivineRPG/issues).
3. Click `New Issue` right below `Star` and `Fork`.
4. Enter your Issue's title (something that summarizes your issue), and then create a detailed description ("Could you add/change _____?" or "Found an exploit/bug:  stuff").
	* If you are reporting a bug report from an outdated or unofficial version (you got the mod from someone else, a website other than our forums or wiki, or if its been modified in ANY way) , make sure you include the following:
		* Version and commit SHA (found in changelog inside of the mod's jar)
		* ForgeModLoader log
		* Server log (if applicable)
		* Crash report (if applicable)
		* Detailed description of the bug
	* Please note, if you are not using an official version, the bug may go un-fixed
5. Click `Submit new issue`, and be patient so we can fix it!
