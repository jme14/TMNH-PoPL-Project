import * as fs from 'fs';
import { CharStreams, CommonTokenStream } from 'antlr4';
import TMNHLexer from './generated/TMNHLexer';
import TMNHParser from './generated/TMNHParser';
import TMNHListener from './generated/TMNHListener'; 

const input = fs.readFileSync('project_deliverable_1.py', 'utf-8');
const lexer = new TMNHLexer(CharStreams.fromString(input));
const tokenStream = new CommonTokenStream(lexer);
const parser = new TMNHParser(tokenStream);
const tree = parser.prog();

console.log(tree); //IDK if this will work im just yoloing