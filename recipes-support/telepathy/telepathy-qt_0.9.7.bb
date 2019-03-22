SUMMARY = "Telepathy-Qt"
HOMEPAGE = "https://telepathy.freedesktop.org/"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=2d5025d4aa3495befef8f17206a5b0a1"

DEPENDS = "qtbase python"

SRC_URI = " \
    git://github.com/TelepathyIM/telepathy-qt.git \
    file://0001-Hardcode-path-to-FindLibPython.py-FIND_FILE-does-not.patch \
"
SRCREV = "7aee69a39e169c4cf49ee3eb218a319a1b822c1e"
S = "${WORKDIR}/git"

inherit cmake_qt5 pythonnative

EXTRA_OECMAKE += " \
    -DDESIRED_QT_VERSION=5 \
    -DENABLE_TESTS=FALSE \
    -DENABLE_FARSTREAM=FALSE \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
"
