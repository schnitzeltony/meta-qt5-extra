SUMMARY = "Additional components to increase the functionality of KIO"
LICENSE = "GPLv2 & MIT"

LIC_FILES_CHKSUM = " \
    file://fish/COPYING;md5=30716a35f5010d5fdbe911cc67144b31 \
    file://info/LICENSE;md5=45306e1027c3de81e7855c7cc3110a0c \
    file://mtp/LICENCE;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://mtp/COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://man/LICENSE;md5=d975629b732b61cb58f9595c6baa9379 \
"

inherit kde-apps gettext

DEPENDS += " \
    qtsvg \
    qtwebengine \
    \
    exiv2 \
    kactivities \
    karchive \
    kauth-native \
    kconfig-native \
    kconfigwidgets \
    kcoreaddons-native \
    kdbusaddons \
    kdoctools-native \
    sonnet-native \
    kdnssd \
    kiconthemes \
    ki18n \
    kio \
    khtml \
    kpty \
    solid \
    kbookmarks \
    kguiaddons \
    syntax-highlighting \
    shared-mime-info-native \
"

# REVISIT optionals
# libssh \
# openslp
# openssh <-> dropbear
DEPENDS += " \
    phonon \
    libmtp \
    samba \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "fb1820f4c0dd06629a36e639d0b59b21"
SRC_URI[sha256sum] = "a0b8f08ab8f9d36cfdc950470f75726e90e9fba159bc2035931cfa6efbfe4394"

# gperf creates hard #line links
do_install_prepend() {
    no_staging_check=true
}

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

RDEPENDS_${PN} += "perl"
