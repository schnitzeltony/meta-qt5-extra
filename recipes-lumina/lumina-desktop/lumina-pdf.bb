SUMMARY = "PDF Viewer Utility from the Lumina Desktop"
HOMEPAGE = "https://lumina-desktop.org/"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=45b10a7bfb52b622b91ca67ea02e4afa"

REQUIRED_DISTRO_FEATURES = "x11"

QT_TRANSLATION_FILES = "${datadir}/*/i18n/*.qm"

inherit qmake5 distro_features_check gtk-icon-cache qt5-translation manpages

DEPENDS += " \
    qttools-native \
    qtbase \
    poppler \
"

SRC_URI = " \
    git://github.com/lumina-desktop/lumina-pdf.git \
    file://0001-drawablepage.h-Add-missing-include.patch \
"
SRCREV = "645ed591ef91c3607d3ab87dd86f7acfd08b05c9"
S = "${WORKDIR}/git/src-qt5"
PV = "1.5.0"

do_configure_prepend() {
    # change paths by sed instead of endles escapes in 'DEFINES+=..' below
    sed -i 's:L_ETCDIR:QString("${sysconfdir}"):' `find ${S} -name *.cpp`
    sed -i 's:L_SHAREDIR:QString("${datadir}"):' `find ${S} -name *.cpp`
    sed -i 's:$${MAN_ZIP}:gzip -c:' `find ${S} -name *.pro`
}

# Override magic in src-qt5/OS-detect.pri to our paths
EXTRA_QMAKEVARS_PRE += ' \
    OS=Linux \
    PREFIX=${prefix} \
    L_BINDIR=${bindir} \
    L_LIBDIR=${libdir} \
    L_ETCDIR=${sysconfdir} \
    L_SHAREDIR=${datadir} \
    L_INCLUDEDIR=${STAGING_INCDIR} \
    L_SESSDIR=${datadir}/xsessions \
    L_MANDIR=${mandir} \
    LRELEASE=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lrelease \
    CONFIG+=WITH_I18N \
'
