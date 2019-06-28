# queue_day

It take a file, queue-day.txt,

add the task on top of it

then print the file.

## Installation

Install clojure, see https://clojure.org/guides/getting_started

Install Leiningen, see https://leiningen.org/

## Usage

```
cat queue-day.txt
# nothing

$ lein run do this now
2019-06-28 14:59:10 | do this now

$ lein run another task
2019-06-28 14:59:16 | another task
2019-06-28 14:59:10 | do this now

$ lein run answer to Brian
2019-06-28 14:59:25 | answer to Brian
2019-06-28 14:59:16 | another task
2019-06-28 14:59:10 | do this now


cat queue-day.txt
2019-06-28 14:59:25 | answer to Brian
2019-06-28 14:59:16 | another task
2019-06-28 14:59:10 | do this now
```

## License

MIT
