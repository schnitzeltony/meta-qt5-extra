require ${BPN}.inc 

inherit pythonnative

# revisit python?

DEPENDS += "${BPN}-native qtscript qtdeclarative"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/kf5"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/kf5/.debug"
