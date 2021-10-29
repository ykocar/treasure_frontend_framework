**Treasure Frontend Project**

I have created a BDD/Cucumber Framework. Test Cases are created regarding to the Task given.

I have created project by using Maven as a management tool.

I have written my test cases in feature files by using Gherkin Language which is plain English.

Corresponding these feature files, I have created Step Definition files which are written by Java Language and consist of separated methods for each test step.

I have created my pages by Page Object Model. Each java class is for against a page in project. These pages have 'Is A' relationship between Base Page. Base Page is created as Abstract class and parent of all other page classes.

I also created a Runner class to run all test cases from one place and it also helps connecting my packages to each other.

And I created utilities package which stores my Driver, Configuration Reader and Browser Utils Classes.

_How to download project:_

After clicking my Github Url you will be navigated to the project in GitHub

At the right top of the project you will see Code button, when you click it you will see clone button with an Url. You need to copy that Url.

When you open any IDE, you will see an option to create a new project.

By providing the Url you will be able to download project and run test cases from your local.