SUMMARY = "System preferences for the Hawaii desktop environment"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit hawaii

DEPENDS += "polkit-qt-1 kscreen"

SRCREV = "4a3ca3e05ba591ff2cbb1f97f27e19e6cf5a1489"
PV = "0.4.0+git${SRCPV}"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DQt5LinguistTools_DIR=${STAGING_LIBDIR_NATIVE}/cmake/Qt5LinguistTools"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_QML}/org/hawaii/systempreferences/*/.debug \
"
