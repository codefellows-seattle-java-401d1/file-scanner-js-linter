## Documentation
In your `README.md` describe the behavior of the linter and explain what
users should expect to see when it runs.

The linter as structured takes in the file gates.js, then initiates a scan of the document, returning the line as a string
The string then is evaluated for } { if else and emptiness and a missing semi colon.
Each new line increments the lineNum variable and if the conditions are met it prints out the string " Line X is Missing Semicolon"