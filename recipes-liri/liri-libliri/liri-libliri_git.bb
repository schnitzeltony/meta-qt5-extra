SUMMARY = "Library for Liri apps"
LICENSE = "LGPLv3 & GFDL-1.3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
	file://LICENSE.FDL;md5=10b9de612d532fdeeb7fe8fcd1435cc6 \
"

inherit liri

PV = "0.9.0+git${SRCPV}"

SRCREV = "ddc3b049db412a89e91a37bd35e0435e76df7adc"
S = "${WORKDIR}/git"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML}/Liri \
"
