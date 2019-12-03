SUMMARY = "Qt component for application lifecycle management "
HOMEPAGE = "https://doc.qt.io/QtApplicationManager/index.html"

# Taken from qtbase / based upon [1]
# [1] https://github.com/qt/qtapplicationmanager/commit/ad92263c32fd5fc1f79134607e99160d459b64e0#diff-24ae8db1bf70b4900036589a2f522803
LICENSE = "GFDL-1.3 & BSD & ( GPL-3.0 & The-Qt-Company-GPL-Exception-1.0 | The-Qt-Company-Commercial ) & ( GPL-2.0+ | LGPL-3.0 | The-Qt-Company-Commercial )"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPL3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
    file://LICENSE.GPL2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LICENSE.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
    file://LICENSE.GPL3-EXCEPT;md5=763d8c535a234d9a3fb682c7ecb6c073 \
    file://LICENSE.FDL;md5=6d9f2a9af4c8b8c3c769f6cc1b6aaf7e \
"

inherit qmake5

DEPENDS = " \
    qtbase \
    qtdeclarative \
    qtwayland \
    libyaml \
    libarchive \
"

BASE_PV = "5.12"

SRC_URI = "git://github.com/qt/qtapplicationmanager.git;branch=${BASE_PV}"
SRCREV = "9f07efec1cf09c629e7fc04417e6a5ccca2687bc"
S = "${WORKDIR}/git"
PV = "${BASE_PV}+git${SRCPV}"

