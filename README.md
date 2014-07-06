RefContextBean experiment
=========================

This project tries to have two webapps sharing a parent Spring context so that the same beans
can be accessed by both.

Structure
=========

The project is provided with the following structure:

    /root-project
    |
    +-- shared-lib: contains the service interface used by both the supplier and consumer webapps
    |
    +-- supplier  : webapp that initializes a Spring context to be used as a parent context
    |
    +-- consumer  : webapp that uses beans declared in suppliers's context
    |
    +-- runner    : testing projects that deploys both supplier and consumer into tomcat and verifies their behavior
    
TODO
====

The following have still to be tested:

- Using stateful service beans to verify the singleton behavior

License
=======

The code in this project is provided under the MIT license, see the [license note](LICENSE.txt)
