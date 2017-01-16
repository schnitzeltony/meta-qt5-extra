SUMMARY = "Additional components to increase the functionality of KIO"
LICENSE = "GPLv2 & MIT"

LIC_FILES_CHKSUM = " \
    file://fish/COPYING;md5=30716a35f5010d5fdbe911cc67144b31 \
    file://info/LICENSE;md5=45306e1027c3de81e7855c7cc3110a0c \
    file://mtp/LICENCE;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://mtp/COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://man/LICENSE;md5=d975629b732b61cb58f9595c6baa9379 \
"

inherit kde-apps

DEPENDS += " \
    qtsvg \
    \
    exiv2 \
    kactivities \
    karchive \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kdbusaddons \
    kdoctools \
    kdnssd \
    kiconthemes \
    ki18n \
    kio \
    khtml \
    kdelibs4support \
    kpty \
    solid \
    kbookmarks \
    kguiaddons \
"

# REVISIT optionals
# openslp
# openssh <-> dropbear
DEPENDS += " \
    phonon \
    libmtp \
    samba \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "7afd2a4e1f645ef45450c1087e42206e"
SRC_URI[sha256sum] = "2cb558a7658894ee67f9318bbd98949b8eda425e5a30ca2af761e5d54d807093"

FILES_${PN} += " \
    ${datadir}/kio_bookmarks \
    ${datadir}/kio_info \ 
    ${datadir}/config.kcfg \
    ${datadir}/k*5 \
    ${datadir}/kio_desktop \
    ${datadir}/mime \
    ${datadir}/konqueror \
    ${datadir}/konqsidebartng \
    ${datadir}/dbus-1 \
    ${datadir}/remoteview \
    ${datadir}/kio_docfilter \
    ${datadir}/solid \
    \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"
