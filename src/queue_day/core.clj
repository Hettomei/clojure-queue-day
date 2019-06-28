(ns queue-day.core
  (:gen-class))

(def my-queue-file "queue-day.txt")

(def my-temp-file (java.io.File/createTempFile "queue-tmp" ".txt"))

(defn queue-file [] (slurp my-queue-file))

(def date (java.util.Date.))

(defn add-task-on-top-of [file args]
  (with-open [file (clojure.java.io/writer file)]
    (binding [*out* file]
      (println (.format (java.text.SimpleDateFormat. "yyyy-MM-dd HH:mm:ss") date) "|" (clojure.string/join " " args))
      (print (queue-file)))))


(defn -main
  [& args]
  (add-task-on-top-of my-temp-file args)
  (.renameTo my-temp-file (java.io.File. my-queue-file))
  (print (queue-file)))
