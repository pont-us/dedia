dedia: strip diacritics from filenames
======================================

dedia is a small utility which removes diacritics and some punctuation
marks from filenames. This can be useful for files which will be used on
a variety of filesystems and operating systems. In such cases characters
outside the ASCII set may be corrupted by character set incompatibility
(e.g. Latin-1 vs UTF-8), and certain punctuation marks may be illegal
or inconvenient on some filesystems (e.g. ":" on FAT).

Compiling
---------

dedia is a NetBeans Java project and can be built by running the `ant`
tool in the project's root directory.

Usage
-----

    java -jar Dedia.jar <filename> ...

Each specified filename will be renamed to strip any diacritics from the
characters and remove "dangerous" punctuation marks. For instance, a
file named `Ångström: Optical Researches (1855).pdf` would be renamed to
`Angstrom Optical Researches 1855.pdf`.

Copyright and license
---------------------

dedia is Copyright 2011, 2016 Pontus Lurcock (pont at talvi dot net) and
released under the MIT license:

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
