import * as fs from "fs";
import { CharStreams, CommonTokenStream } from "antlr4ts";
import { TMNHLexer } from "./generated/TMNHLexer";
import { TMNHParser } from "./generated/TMNHParser";

const input = fs.readFileSync("project_deliverable_3.py", "utf-8");
const charStream = CharStreams.fromString(input)
const lexer = new TMNHLexer(charStream);
const tokenStream = new CommonTokenStream(lexer);
const parser = new TMNHParser(tokenStream);
const tree = parser.prog();

console.log(tree.toStringTree(parser))

