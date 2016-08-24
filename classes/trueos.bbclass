inherit qmake5

HOMEPAGE = "http://www.trueos.org/"

S = "${WORKDIR}/git"

EXTRA_QMAKEVARS_PRE = "\
    PREFIX=${OE_QMAKE_PATH_PREFIX} \
"
