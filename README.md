# Peanut Butter Parser

Coding challenge: Given a string that contains no spaces but is composed of valid words, split the string into words.

An example input might look like `peanutbutter`.
Valid words are those found in this dictionary `pea, nut, peanut, but, butt, butter`.

## Assumptions

1. The string can be empty.
1. The string is composed of only valid words.
1. Input contains no spaces.

## Solutions

I plan on adding improved solutions, but for now I've implemented the following:

### `PairParser`

The `PairParser` attempts to split the string into two words, though one or zero could be returned.

- `peanutbutter` produces `[peanut, butter]`
- `peanut` produces `[pea, nut]`
- `pea` produces `[pea]`
- `pe` produces `[]`
- `peanuts` also produces `[]`

### `RecursiveParser`

The `RecursiveParser` behaves like the `PairParser` except it splits the string into a list of the shortest matched words.

- `peanutbutter` produces `[pea, nut, butter]`
