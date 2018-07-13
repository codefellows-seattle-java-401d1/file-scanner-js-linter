# JavaScript Linter
This program reads through a JavaScript line by line and prints an error whenever it finds a line that doesn't end in a semi-colon.

Errors will not be shown if:
* If the line is empty
* If the line ends with an opening curly brace {
* If the line ends with a closing curly brace }
* If the line contains _if_ or _else_