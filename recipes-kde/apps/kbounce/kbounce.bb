SUMMARY = "KBounce is a single player arcade game with the elements of puzzle"
DESCRIPTION = "KBounce is a single player arcade game with the elements of puzzle. It is played on a field, surrounded by wall, with two or more balls bouncing around within the walls. The object of the game is to build new walls to decrease the size of the active field."
LICENSE = "GPLv2 & LGPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps

DEPENDS += "\
    kcoreaddons \
    kconfig \
    kdbusaddons  \
    ki18n \
    kguiaddons \
    kconfigwidgets \
    kiconthemes \
    kcompletion \
    ktextwidgets \
    kxmlgui \
    kio \
    knotifyconfig \
    libkdegames \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "6f8c8f74e760358a984f9a46a84aca46"
SRC_URI[sha256sum] = "67478b78118f1f9441d789aee7e5609943142874dba116ec4c08bc38b1a7d969"
SRC_URI += "file://0001-fix-build-with-QT_NO_SESSIONMANAGER-set.patch"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
    ${datadir}/icons \
"
