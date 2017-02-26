# Entropy Game Engine
[![Build Status](https://travis-ci.org/ErikGartner/entropy-game-engine.svg?branch=master)](https://travis-ci.org/ErikGartner/entropy-game-engine)

*For every action, there is a reaction, and a Piker reaction is quite a fuckin' thing.* - Turkish in Snatch (2000)

The idea is to create an advanced ai engine that plans actions for characters
based on their goals, states, knowledge in a closed world.

## Design
Entropy's central concept is that characters are proactive agents that actively pursue some set of goals.

![Conceptual Design](https://docs.google.com/drawings/d/13o-5cGC5wXaMtvw2RXh2hH4BqHASez4oiPGbMfWZon0/pub?w=1815&amp;h=1057)

## Installation

Run using sbt:
```bash
sbt run
```

Run tests using:
```bash
sbt test
```

## Further Reading

- [U-DIRECTOR](http://dl.acm.org/citation.cfm?id=1160808)
- [Non-Linear Interactive Storytelling Using Object-Oriented Bayesian Networks (2004)](http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.552.7311)
- [Generation of Adaptive Dilemma-Based
Interactive Narratives](http://ieeexplore.ieee.org/document/5345846/?reload=true)
