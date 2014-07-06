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

The code in this project is provided under the MIT license, see the [license note](LICENSE.txt):

> Copyright (C) 2014 Carlo Sciolla
> 
> Permission is hereby granted, free of charge, to any person obtaining a copy of this software
> and associated documentation files (the "Software"), to deal in the Software without restriction,
> including without limitation the rights to use, copy, modify, merge, publish, distribute,
> sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
> furnished to do so, subject to the following conditions:
> 
> The above copyright notice and this permission notice shall be included in all copies or substantial
> portions of the Software.
> 
> THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
> NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
> IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
> WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
> SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
