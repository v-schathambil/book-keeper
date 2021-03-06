
# Changelog

Changelog for ghacupha book-keeper.

## Unreleased
### No issue

**Added time and money libraries**


[4ed3b7a6c6194c5](https://github.com/ghacupha/book-keeper/commit/4ed3b7a6c6194c5) Edwin Njeru *2018-06-06 10:11:23*

**removed units of time and money from the library**


[652495155b2fe87](https://github.com/ghacupha/book-keeper/commit/652495155b2fe87) Edwin Njeru *2018-06-06 09:59:46*

**updated the license in the unix startup script**


[12dcab7cb96d2c1](https://github.com/ghacupha/book-keeper/commit/12dcab7cb96d2c1) Edwin Njeru *2018-06-06 09:57:15*

**Fixed checkstyle issues with the tags**


[48267f98e1a9fa1](https://github.com/ghacupha/book-keeper/commit/48267f98e1a9fa1) Edwin Njeru *2018-06-06 09:44:21*

**Configured mycilia header styles**


[b493f2f551873e4](https://github.com/ghacupha/book-keeper/commit/b493f2f551873e4) Edwin Njeru *2018-06-06 09:36:35*

**Removed mycilia license plugin version and removed license header checking from the checkstyle config**


[d6e1b9d6d7583dc](https://github.com/ghacupha/book-keeper/commit/d6e1b9d6d7583dc) Edwin Njeru *2018-06-06 09:10:22*

**Added jitpack repository**


[f5f5cf7c47afb7f](https://github.com/ghacupha/book-keeper/commit/f5f5cf7c47afb7f) Edwin Njeru *2018-06-06 09:05:35*

**Removed additional unnecessary plugins**


[d10c170440a7ec5](https://github.com/ghacupha/book-keeper/commit/d10c170440a7ec5) Edwin Njeru *2018-06-06 09:02:33*

**Removed unnecessary plugin management**


[5ef71a0aa8ebab0](https://github.com/ghacupha/book-keeper/commit/5ef71a0aa8ebab0) Edwin Njeru *2018-06-06 08:52:24*

**Removed maven site plugin**


[1db7c579635fa03](https://github.com/ghacupha/book-keeper/commit/1db7c579635fa03) Edwin Njeru *2018-06-06 08:43:46*


## 1.2.0
### No issue

**preparing for version 1.2.0**


[8bb58d9ec32ffaa](https://github.com/ghacupha/book-keeper/commit/8bb58d9ec32ffaa) Edwin Njeru *2018-04-12 08:38:59*

**preparing for version 1.2.0**


[8ce478151d20ca0](https://github.com/ghacupha/book-keeper/commit/8ce478151d20ca0) Edwin Njeru *2018-04-12 08:37:29*

**preparing for version 1.2.0**


[6896ce16916e5b8](https://github.com/ghacupha/book-keeper/commit/6896ce16916e5b8) Edwin Njeru *2018-04-12 08:37:04*

**Replaced multiple IFs in the AccountAppraisalDelegate by implementing State pattern to represent the AccountSide of the Account implementation**


[6023932b2c45152](https://github.com/ghacupha/book-keeper/commit/6023932b2c45152) Edwin Njeru *2018-04-11 16:29:54*

**Additional comments and review of aggregation algorithms getCredits() and getDebits()**


[5ecf210986080b9](https://github.com/ghacupha/book-keeper/commit/5ecf210986080b9) Edwin Njeru *2018-04-11 15:03:38*

**finalised ammendments to the delegate. ToDo checkstyle checks**


[a8e1e3a94dc02af](https://github.com/ghacupha/book-keeper/commit/a8e1e3a94dc02af) ghacupha *2018-04-02 08:17:21*

**finalised ammendments to the delegate. ToDo checkstyle checks**


[01d68fdda7a2bf8](https://github.com/ghacupha/book-keeper/commit/01d68fdda7a2bf8) ghacupha *2018-04-02 08:13:02*

**created the AssignableCollectionAccount and also a constructor allowing assignment of the Collection in the simpleAccount laying the ground work for assignment of the underlying collection for the account and further allow implementation of persistent Entries into the Account**


[9a6a176598a563b](https://github.com/ghacupha/book-keeper/commit/9a6a176598a563b) ghacupha *2018-04-01 14:11:58*

**created the AssignableCollectionAccount and also a constructor allowing assignment of the Collection in the simpleAccount laying the ground work for assignment of the underlying collection for the account and further allow implementation of persistent Entries into the Account**


[70eaa86b902ab55](https://github.com/ghacupha/book-keeper/commit/70eaa86b902ab55) ghacupha *2018-04-01 14:10:15*

**created the AssignableCollectionAccount and also a constructor allowing assignment of the Collection in the simpleAccount laying the ground work for assignment of the underlying collection for the account and further allow implementation of persistent Entries into the Account**


[dc753f5f07db654](https://github.com/ghacupha/book-keeper/commit/dc753f5f07db654) ghacupha *2018-04-01 14:09:03*

**created the AccountAppraisalDelegate and refactored the Account#balance method into the delegate allowing other Account implementations of the Account interface to reuse this method. This makes a way to implement the PersistentAccount I have been thinking about, without so much repetition**


[5969b9075cd3495](https://github.com/ghacupha/book-keeper/commit/5969b9075cd3495) ghacupha *2018-04-01 13:53:33*

**created the AccountAppraisalDelegate and refactored the Account#balance method into the delegate allowing other Account implementations of the Account interface to reuse this method. This makes a way to implement the PersistentAccount I have been thinking about, without so much repetition**


[9768b159c1522a7](https://github.com/ghacupha/book-keeper/commit/9768b159c1522a7) ghacupha *2018-04-01 13:27:36*

**Made the SimpleAccount and the SimpleTransaction more thread-safe by adding volatile fields**


[64891fe42fdb467](https://github.com/ghacupha/book-keeper/commit/64891fe42fdb467) ghacupha *2018-04-01 12:33:21*

**Made the SimpleAccount and the SimpleTransaction more thread-safe by adding volatile fields**


[ad094fa9fe28690](https://github.com/ghacupha/book-keeper/commit/ad094fa9fe28690) ghacupha *2018-04-01 10:31:35*

**configured builds to ensure the commands are working**


[d6a3390ae8ade68](https://github.com/ghacupha/book-keeper/commit/d6a3390ae8ade68) Edwin Njeru *2018-03-29 16:51:41*

**removed deleted classes from the Exception classes' comments**


[cb712d5171910f4](https://github.com/ghacupha/book-keeper/commit/cb712d5171910f4) Edwin Njeru *2018-03-29 16:46:24*

**added currency parameter to SimpleTransaction**


[67cf8253b53bd26](https://github.com/ghacupha/book-keeper/commit/67cf8253b53bd26) Edwin Njeru *2018-03-29 16:34:05*

**added currency parameter to SimpleTransaction**


[a972b7f4334c5cd](https://github.com/ghacupha/book-keeper/commit/a972b7f4334c5cd) Edwin Njeru *2018-03-29 16:08:07*

**simplified account pattern to only implement directed accounting transaction pattern**


[bf67a14b0a76fd8](https://github.com/ghacupha/book-keeper/commit/bf67a14b0a76fd8) Edwin Njeru *2018-03-29 15:35:58*

**simplified account pattern to only implement directed accounting transaction pattern**


[adf6ba14643217b](https://github.com/ghacupha/book-keeper/commit/adf6ba14643217b) Edwin Njeru *2018-03-29 15:07:25*

**Used filtered streams to capture debits abd credits in the DirectedTransaction. Created more intuitive naming for Account implementation**


[08b8f29d9446f36](https://github.com/ghacupha/book-keeper/commit/08b8f29d9446f36) Edwin Njeru *2018-03-28 12:23:15*

**failed account-reversal test. To review later using spotbugs**


[09709770ed39efa](https://github.com/ghacupha/book-keeper/commit/09709770ed39efa) Edwin Njeru *2018-03-26 15:15:47*

**added configurations for maven reversing java version to 1.8_162 to resolve maven-integration issues**


[7674e3d3da5e389](https://github.com/ghacupha/book-keeper/commit/7674e3d3da5e389) Edwin Njeru *2018-03-26 13:22:58*

**release preparation**


[50481501be3c3c9](https://github.com/ghacupha/book-keeper/commit/50481501be3c3c9) ghacupha *2018-03-25 14:32:31*

**Amended bugs in the DirectedJournal and DirectedTrnsaction, enhanced exception messages and added test coverage**


[6618c8053f81b8f](https://github.com/ghacupha/book-keeper/commit/6618c8053f81b8f) ghacupha *2018-03-25 13:38:51*

**Amended bugs in the DirectedJournal and DirectedTrnsaction, enhanced exception messages and added test coverage**


[67f3f3dc3d7573f](https://github.com/ghacupha/book-keeper/commit/67f3f3dc3d7573f) ghacupha *2018-03-25 13:38:29*

**commited changes to Isolate DirectedJournal for unit testing**


[238ca4d6c09966c](https://github.com/ghacupha/book-keeper/commit/238ca4d6c09966c) Edwin Njeru *2018-03-23 17:44:23*

**created tests for the Directed Journal and the DirectedTransaction**


[b6180cad7513c7f](https://github.com/ghacupha/book-keeper/commit/b6180cad7513c7f) Edwin Njeru *2018-03-23 17:02:16*

**completed implementation of the DirectedJournal**


[61b72c6103b4e22](https://github.com/ghacupha/book-keeper/commit/61b72c6103b4e22) Edwin Njeru *2018-03-23 12:50:51*

**Created criteria to wrap journal side for Entry and Account**


[b19cd27824c2333](https://github.com/ghacupha/book-keeper/commit/b19cd27824c2333) Edwin Njeru *2018-03-22 06:53:19*

**Added classes to supprt Journalized entry workflows**


[7581789936350ac](https://github.com/ghacupha/book-keeper/commit/7581789936350ac) Edwin Njeru *2018-03-21 16:07:29*

**Migrated the first parameer used in Entry interface from AccountImpl to Account**


[9c14d636aaaf61e](https://github.com/ghacupha/book-keeper/commit/9c14d636aaaf61e) Edwin Njeru *2018-03-21 15:22:37*

**automated changelogs**


[3987b5da26a76ce](https://github.com/ghacupha/book-keeper/commit/3987b5da26a76ce) Edwin Njeru *2018-03-21 14:24:26*


## 1.2-SNAPSHOT
### No issue

**fixed group-import in the mismatchedCurrencyException**


[8fe2893499389e4](https://github.com/ghacupha/book-keeper/commit/8fe2893499389e4) Edwin Njeru *2018-03-21 13:43:54*

**merged local branches with master**


[a8053eebad48705](https://github.com/ghacupha/book-keeper/commit/a8053eebad48705) Edwin Njeru *2018-03-21 13:34:03*

**merging changes from new-pom**


[967382b75f9236c](https://github.com/ghacupha/book-keeper/commit/967382b75f9236c) Edwin Njeru *2018-03-21 13:16:43*

**reconfiguration of the project object model**


[89ba7c8106eb68d](https://github.com/ghacupha/book-keeper/commit/89ba7c8106eb68d) Edwin Njeru *2018-03-21 12:29:59*

**added missing module**


[eee13eb5552c496](https://github.com/ghacupha/book-keeper/commit/eee13eb5552c496) Edwin Njeru *2018-03-21 11:55:33*

**added missing files**


[edd8db658c121ca](https://github.com/ghacupha/book-keeper/commit/edd8db658c121ca) Edwin Njeru *2018-03-21 08:10:59*

**rearranging files for proper java9 exports**


[0e1d1d6c76e1dab](https://github.com/ghacupha/book-keeper/commit/0e1d1d6c76e1dab) Edwin Njeru *2018-03-21 06:27:26*

**Added AccountingTransaction and Transaction**


[ad154d7768ccedd](https://github.com/ghacupha/book-keeper/commit/ad154d7768ccedd) Edwin Njeru *2018-03-20 16:20:55*

**created AccountAttributes interface**


[d88312bfc413d05](https://github.com/ghacupha/book-keeper/commit/d88312bfc413d05) Edwin Njeru *2018-03-20 12:45:50*

**minor amendments to the tests**


[7b010cdaeaf4d37](https://github.com/ghacupha/book-keeper/commit/7b010cdaeaf4d37) Edwin Njeru *2018-03-20 11:55:36*

**used maven instead of the wrapper for the CI**


[4cfb6977d5c1385](https://github.com/ghacupha/book-keeper/commit/4cfb6977d5c1385) Edwin Njeru *2018-03-20 11:31:32*

**fixed failing CI tests**


[513ba96d8286270](https://github.com/ghacupha/book-keeper/commit/513ba96d8286270) Edwin Njeru *2018-03-20 11:24:37*

**Fixed checkstyle issues**


[bef8647d2326d72](https://github.com/ghacupha/book-keeper/commit/bef8647d2326d72) Edwin Njeru *2018-03-20 10:54:29*

**added cash as interface for monetary representation and removed unused dependencies**


[769ebfac3fce399](https://github.com/ghacupha/book-keeper/commit/769ebfac3fce399) Edwin Njeru *2018-03-20 07:05:06*

**final maven workflows configurations**


[14b44114cd608d5](https://github.com/ghacupha/book-keeper/commit/14b44114cd608d5) Edwin Njeru *2018-03-19 15:52:38*

**amended errors in the CI config**


[10f5f7bf571459b](https://github.com/ghacupha/book-keeper/commit/10f5f7bf571459b) Edwin Njeru *2018-03-19 13:37:30*

**amended errors in the CI config**


[182e061106ddb58](https://github.com/ghacupha/book-keeper/commit/182e061106ddb58) Edwin Njeru *2018-03-19 11:37:22*

**additional configs for deployment**


[ee7395191af8f81](https://github.com/ghacupha/book-keeper/commit/ee7395191af8f81) Edwin Njeru *2018-03-19 11:30:16*

**additional project configurations settings**


[1f515e6c248cc2d](https://github.com/ghacupha/book-keeper/commit/1f515e6c248cc2d) Edwin Njeru *2018-03-19 10:40:07*

**added maven-versions-plugin**


[9087a845a4396f3](https://github.com/ghacupha/book-keeper/commit/9087a845a4396f3) Edwin Njeru *2018-03-19 09:32:44*

**additional release configs and downloading missing plugins**


[1d1d9248c364276](https://github.com/ghacupha/book-keeper/commit/1d1d9248c364276) Edwin Njeru *2018-03-19 09:07:42*

**additional release configs and downloading missing plugins**


[1b9d4bd677290f3](https://github.com/ghacupha/book-keeper/commit/1b9d4bd677290f3) Edwin Njeru *2018-03-19 08:59:11*

**additional release configs and downloading missing plugins**


[88d33516547e3ee](https://github.com/ghacupha/book-keeper/commit/88d33516547e3ee) Edwin Njeru *2018-03-19 08:55:35*

**downloaded missing maven plugins from maven central**


[dd8fbf9ea9efa3f](https://github.com/ghacupha/book-keeper/commit/dd8fbf9ea9efa3f) Edwin Njeru *2018-03-19 08:43:40*

**release preparations**


[29dd05c93ef51c3](https://github.com/ghacupha/book-keeper/commit/29dd05c93ef51c3) Edwin Njeru *2018-03-19 07:40:24*

**amended illustration in the readme file**


[c366bc1cdb1e91f](https://github.com/ghacupha/book-keeper/commit/c366bc1cdb1e91f) ghacupha *2018-03-18 09:02:18*

**amended wrong type in the account**


[9f80fed5aabbb7d](https://github.com/ghacupha/book-keeper/commit/9f80fed5aabbb7d) ghacupha *2018-03-18 08:58:38*

**added tests for the account**


[23bbdf320d952d3](https://github.com/ghacupha/book-keeper/commit/23bbdf320d952d3) ghacupha *2018-03-18 08:57:42*

**moved packages for Time and Money into the unit package**


[91bff1c6d8a7e6d](https://github.com/ghacupha/book-keeper/commit/91bff1c6d8a7e6d) ghacupha *2018-03-18 08:43:48*

**added ExtendedMoney class**


[b8318df90f88599](https://github.com/ghacupha/book-keeper/commit/b8318df90f88599) ghacupha *2018-03-18 08:39:21*

**rearranged the directory structure for release**


[36875f73710a416](https://github.com/ghacupha/book-keeper/commit/36875f73710a416) Edwin Njeru *2018-03-16 17:53:09*

**Create README.md**


[23c617b221449ff](https://github.com/ghacupha/book-keeper/commit/23c617b221449ff) Edwin Njeru *2018-03-16 15:06:30*

**add license**


[8739a2efbbaa3ce](https://github.com/ghacupha/book-keeper/commit/8739a2efbbaa3ce) Edwin Njeru *2018-03-16 15:00:40*



