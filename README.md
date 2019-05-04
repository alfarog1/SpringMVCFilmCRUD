# Spring MVC Film C.R.U.D. Project

## Overview
This program implements full-stack web-based C.R.U.D functionality, using Spring MVC and the DAO pattern.  

## Program Purpose
The purpose of the program is to mimic a video rental company's database.  You can search, add, edit, or delete movies into the database.  The program incorporates both front and back-end elements.  For example, you can add a new movie to the database, print it out, and then you can also delete it.  

## Installation
The first requirement is to obtain a copy of the database from Github/SkillDistillery/SD20.  The project incorporates Gradle as well as Spring, so both of those most be installed in your IDE in order to run the program successfully.   

## UML
![UML](https://github.com/alfarog1/SpringMVCFilmCRUD/blob/master/MVCFilmSiteUML.png)

## How To Use
When the program is initiated, you will be presented with a simple menu.  You have the option to find a film by its ID, or by its keyword.  

If you search by ID, for example, if you input the number 421, it will return the film title "Holiday Games", along with its relevant information.  

On the other hand, if you search for a title by keyword, the program will return all of the films with that keyword in the title.  For example, if you type the word "Good" into the search bar, the resulta will be "GOODFELLAS SALUTE", and "GOODFELLAS SALUTE".

## Concepts/Technologies Used
- Built in Spring Tool Suite (STS/Eclipse)
- Java
- Gradle
- MySQL
- Spring MVC Framework
- C.R.U.D Functionality
- MAMP (MacOS, Apache, MySQL, PHP/Python/Perl(Not used))
- HTML
- MySQL WorkBench
- Atom
- Bash Terminal

## Entity Relationship Diagram (MySQL)
![ERD](https://github.com/alfarog1/SpringMVCFilmCRUD/blob/master/FilmSiteERDiagram.png)

## Lessons Learned
- Using Data Accessor Objects to connect to persistent data
- Reinforced Object Oriented Programming  principles
- Using controllers and connecting them to Java Server Pages (JSP)
- Working with XML files
- Working with GIT branches (pushing and pulling)
- Working with POJO's
- Working with RequestMapping and Autowiring.

## Contributing

Pull requests are welcome, but the developers can not offer support beyond the initial release.  
