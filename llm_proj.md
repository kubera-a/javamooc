# LLM Architecture Survey

Components to investigate:

- [ ]  Embedding Models
    - [ ]  Multilingual
    - [ ]  English only
- [ ]  Vector Databases & Enhancements
    - [ ]  Knowledge Graphs etc.
- [ ]  Evaluation of Prompt techniques
    - [ ]  Useability vs Complexity Tradeoff
- [ ]  Frameworks
    - [ ]  LangChain
    - [ ]  LlamaIndex
- [ ]  Logging
- [ ]  Local vs External
    - [ ]  Ollama etc.
- [ ]  Validation and conformity
    - [ ]  Jsonformer etc.
- [ ]  Monitoring
- [ ]  Cache

Current RAG Landscape:

- [ ]  Survey Papers
- [ ]  Evaluation of specific methods
- [ ]  Useability vs Complexity Tradeoffs
- [ ]  Agent frameworks
- [ ]  What is common best practice now
- [ ]  What are future developments to look towards

# AI Newsletter

Problem Statement:

We want to automate the generation of a monthly newsletter regarding AI developments. This would be an end to end solution that handles ingestion from websites, evaluation of the importance all the way to the generation of the report.

Milestones:

Basics:

- [ ]  Creation of tool for ingesting from a single website (arXiv? twitter? Newsletters? Github?)
    - [ ]  LLM needs to be provided reasoning for this
- [ ]  Evaluation of importance
    - [ ]  How to deal with memory?
    - [ ]  Is this 1:1 voting? Where we constantly compare and rank importance using LLMs?
    - [ ]  Certain websites might provide reasoning, how do we take that into account
- [ ]  Output into text
- [ ]  Formatted output

Enhancements:

- [ ]  Evaluation from multiple website preferably according to category
    - [ ]  Research related
    - [ ]  Products related (Industry applications)
- [ ]  Consolidation and balancing amongst categories
- [ ]  Reformatting output