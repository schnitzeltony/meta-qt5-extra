SUMMARY = "File manager"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=1ebbd3e34237af26da5dc08a4e440464 \
"

inherit liri

PV = "0.2.0+git${SRCPV}"

SRCREV = "e7fef08169a00833fe8f3c33eb771c066267fd5a"
S = "${WORKDIR}/git"

DEPENDS += " \
    qttools \
    qtquickcontrols2 \
    taglib \
    liri-fluid \
"

EXTRA_OECMAKE += "-DQt5LinguistTools_DIR=${STAGING_LIBDIR_NATIVE}/cmake/Qt5LinguistTools"

FILES_${PN} += " \
    ${datadir}/metainfo \
    ${OE_QMAKE_PATH_QML} \
"

RREPLACES_${PN} = "swordfish"
RPROVIDES_${PN} = "swordfish"
RCONFLICTS_${PN} = "swordfish"
