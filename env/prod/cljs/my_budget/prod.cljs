(ns my-budget.prod
  (:require [my-budget.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
