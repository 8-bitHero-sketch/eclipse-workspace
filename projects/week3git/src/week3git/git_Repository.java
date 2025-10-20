package week3git;

public class git_Repository {

	public static void main(String[] args) {
		Windows PowerShell
		Copyright (C) Microsoft Corporation. All rights reserved.

		Install the latest PowerShell for new features and improvements! https://aka.ms/PSWindows

		PS C:\Users\orion\eclipse-workspace\labs_Week_2> git init
		Initialized empty Git repository in C:/Users/orion/eclipse-workspace/labs_Week_2/.git/
		PS C:\Users\orion\eclipse-workspace\labs_Week_2> git status
		On branch master

		No commits yet

		Untracked files:
		  (use "git add <file>..." to include in what will be committed)
		        .classpath
		        .project
		        .settings/
		        bin/
		        src/

		nothing added to commit but untracked files present (use "git add" to track)
		PS C:\Users\orion\eclipse-workspace\labs_Week_2> git add .
		PS C:\Users\orion\eclipse-workspace\labs_Week_2> git status
		On branch master

		No commits yet

		Changes to be committed:
		  (use "git rm --cached <file>..." to unstage)
		        new file:   .classpath
		        new file:   .project
		        new file:   .settings/org.eclipse.core.resources.prefs
		        new file:   .settings/org.eclipse.jdt.core.prefs
		        new file:   bin/labs_Week_2/booleanConditionalsLoopsLab.class
		        new file:   src/labs_Week_2/booleanConditionalsLoopsLab.java

		PS C:\Users\orion\eclipse-workspace\labs_Week_2> git commit -m "first commit being made"
		[master (root-commit) 5fba75b] first commit being made
		 6 files changed, 308 insertions(+)
		 create mode 100644 .classpath
		 create mode 100644 .project
		 create mode 100644 .settings/org.eclipse.core.resources.prefs
		 create mode 100644 .settings/org.eclipse.jdt.core.prefs
		 create mode 100644 bin/labs_Week_2/booleanConditionalsLoopsLab.class
		 create mode 100644 src/labs_Week_2/booleanConditionalsLoopsLab.java
		PS C:\Users\orion\eclipse-workspace\labs_Week_2> git remote add origin https://github.com/8-bitHero-sketch/labs_Week_2.git
		PS C:\Users\orion\eclipse-workspace\labs_Week_2> git branch -M main
		PS C:\Users\orion\eclipse-workspace\labs_Week_2> git push -u origin main
		Enumerating objects: 13, done.
		Counting objects: 100% (13/13), done.
		Delta compression using up to 16 threads
		Compressing objects: 100% (11/11), done.
		Writing objects: 100% (13/13), 5.50 KiB | 2.75 MiB/s, done.
		Total 13 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
		remote:
		remote: Create a pull request for 'main' on GitHub by visiting:
		remote:      https://github.com/8-bitHero-sketch/labs_Week_2/pull/new/main
		remote:
		To https://github.com/8-bitHero-sketch/labs_Week_2.git
		 * [new branch]      main -> main
		branch 'main' set up to track 'origin/main'.
		PS C:\Users\orion\eclipse-workspace\labs_Week_2>

	}

}
