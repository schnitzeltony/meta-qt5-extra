SUMMARY = "Framework for providing different actions given a string query"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://src/abstractrunner.h;endline=18;md5=a6a49d7635ef149bcddf8c46f0eae999"

inherit kde-kf5

DEPENDS += "qtdeclarative kconfig kcoreaddons ki18n kio kservice plasma-framework solid threadweaver"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "0c44e78e610504ee8b2f2e5f040c602c"
SRC_URI[sha256sum] = "295fe3cf3feb4a905ad9075739ddc442f9512b0465bc2d68201f24c0dfcdabd6"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kdevappwizard \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/*/.debug"
