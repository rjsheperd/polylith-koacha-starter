(ns starter.stapler.interface-test
  (:require [clojure.test :as test :refer [deftest is]]
            [starter.stapler.interface :as stapler]))

(deftest stapler-test
  (is (= [1 1] (stapler/staple 1 1))))
