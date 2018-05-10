# Interpeter Pattern
Used to make representations of languages such as SQL and Abstract Syntax Trees.
And is used essentially to break down grammars that are regular grammars (Composed of Terminal and non Terminal expressions)
Grammar are used everywhere such as music, math equation, and even natural languages. Which allows us to interpret a sentence and map a domain.

Interpeter aren't used for parsing but for actually interpeting a sentence

Examples:
    java.util.pattern which is used to match patterns in different things
    java.text.format 
    
## Design
* Abstract Expression: declares an interface for executing an operation
* Interpet: The operation that the abstract expression is executing
* TerminalExpression: the expression are broken down to terminal expressions, Terminal symbols are pieces of the grammar that can't be broken down anymore
* NonterminalExpression: which is used to build up the sentence. Are expression that can be recursive and be composed of compound expression whether being more non terminal or terminal

The full picture:
* Context
* AbstractExpression
* TerminalExpression
* NonterminalExpression
* Client

Client builds the sentence of terminal and non terminal sentence, the context contains global variable, and all expression will implement the abstract expression. Nonterminal will continously call back to the interpret expression while the non terminal will be evaluated

Pitfalls

* Complexity
* Class per rule a lot of classes
* Use of other patterns to get more features
* Very specific case to the problem