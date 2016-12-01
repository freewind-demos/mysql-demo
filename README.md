Mysql JDBC Demo
==============

Mysql simple demo.

## install mysql

My mysql version is `5.7.16`.

On mac: `brew install mysql`

## start mysql

```
mysqld
```

and stop it by `mysqld stop`.

### create user

Login with `root` and create the user for the demo:

```
$ mysql -uroot
> CREATE USER 'demo'@'localhost' IDENTIFIED BY 'demo';
> GRANT ALL PRIVILEGES ON `mysql-demo` . * TO 'demo'@'localhost';
```

You can also change the code from `DB.java` with an existent user.

### create the database

```
$ mysql -udemo -p
mysql> create database `mysql-demo`;
```

### Run the code

You don't need to create any table by command line, because we do that in Java code, see `DB.java`.

```
mvn clean compile
mvn exec:java -Dexec.mainClass="my.Main" -Dexec.cleanupDaemonThreads=false
```

You will see the output like:

```
------- creating table ------
------- inserting ------
id created by database is: 1
id created by database is: 2
------- load all ------
Book #1, title=Java, description=一本好书
Book #2, title=JavaScript, description=另一本好书
------- query by id ------
Book #1, title=Java, description=一本好书
------- update by id ------
Updated 1 rows
------- load all ------
Book #1, title=new-title, description=new-description
Book #2, title=JavaScript, description=另一本好书
------- delete by id ------
Delete 1 rows
------- load all ------
Book #2, title=JavaScript, description=另一本好书
```

## Note

You can also use the `data.sql` to create the table and data manually.



