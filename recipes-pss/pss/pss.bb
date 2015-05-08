SUMMARY = "Plasma Simple Shell"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4b54a1fd55a448865a0b32d41598759d \
"

inherit hawaii pythonnative

DEPENDS += " \
    plasma-framework \
    plasma-workspace \
    ki18n \
    kdelibs4support \
    krunner \
    kservice \
    solid \
"

SRC_URI = " \
    git://github.com/plasma-simple-shell/${BPN}.git \
    file://0001-CMakeLists.txt-do-create-uninstall-target-only-if-no.patch \
"
SRCREV = "9789d63a55e2ca74a70029574a6fe1a1dd94cbc2"
PV = "0.5.90+git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${datadir}/sddm \
    ${datadir}/desktop-directories \
    ${datadir}/kservices5 \
    ${datadir}/plasma \
    ${OE_QMAKE_PATH_QML}/org/pss \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_QML}/*/*/*/*/.debug \
"
