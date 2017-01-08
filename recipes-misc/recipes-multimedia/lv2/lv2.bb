require ${BPN}.inc

inherit waf pkgconfig

DEPENDS = "gtk+ libsndfile1"

EXTRA_OECONF = "--libdir=${libdir}"

FILES_${PN} += " \
    ${datadir} \
"
