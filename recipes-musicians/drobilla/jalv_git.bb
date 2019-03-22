SUMMARY = "Jalv is a simple but fully featured LV2 host for Jack"
HOMEPAGE = "http://drobilla.net/software/jalv"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYING;md5=eb60cfffc455677d4f11cf7f36c12093"

inherit waf pkgconfig gtk-icon-cache

DEPENDS += " \
    qtbase-native \
    lv2 \
    lilv \
    serd \
    sord \
    sratom \
    suil \
    jack \
    gtkmm \
    gtk+3 \
    qtbase \
"

SRC_URI = " \
    git://github.com/drobilla/jalv.git \
    file://0001-Do-not-inject-usr-local-include-to-include-paths.patch \
"
SRCREV = "8311df91cc212adf3220acfcb50ab63414fe9dd6"
S = "${WORKDIR}/git"
PV = "1.6.0+git${SRCPV}"

FILES_${PN} += " \
    ${libdir}/jack \
"
