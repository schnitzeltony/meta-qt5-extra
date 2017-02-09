SUMMARY = "File manager"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit liri

PV = "0.1.0+git${SRCPV}"

SRCREV = "1e130e882f76194b5143af5a4d26eec23ca27f3c"
S = "${WORKDIR}/git"

DEPENDS += " \
    qttools \
    taglib \
    fluid \
"

EXTRA_OECMAKE += "-DQt5LinguistTools_DIR=${STAGING_LIBDIR_NATIVE}/cmake/Qt5LinguistTools"

FILES_${PN} += "${OE_QMAKE_PATH_QML} ${datadir}"

RREPLACES_${PN} = "swordfish"
RPROVIDES_${PN} = "swordfish"
RCONFLICTS_${PN} = "swordfish"
