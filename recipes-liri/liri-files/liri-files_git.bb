SUMMARY = "File manager"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit liri

PV = "0.2.0+git${SRCPV}"

SRCREV = "2b81df03d5cd87b62b842939668786196108a490"
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
