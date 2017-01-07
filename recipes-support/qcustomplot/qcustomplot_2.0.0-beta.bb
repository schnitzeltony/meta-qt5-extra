SUMMARY = "QCustomPlot is a Qt C++ widget for plotting and data visualization"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://GPL.txt;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += " \
    qtbase \
"
SRC_URI = " \
    http://www.qcustomplot.com/release/${PV}/QCustomPlot-source.tar.gz;name=source \
    http://www.qcustomplot.com/release/${PV}/QCustomPlot-sharedlib.tar.gz;name=pro \
    file://qcustomplot-qt5.pc \
"
SRC_URI[source.md5sum] = "dab45087e452562c3382eaa99d04dc97"
SRC_URI[source.sha256sum] = "bf60f7e8c44d2a021bd903b32838269c6d4da1c70427448d57b7e4ae0390909f"

SRC_URI[pro.md5sum] = "294fdf8834e8ef0fa2c1e830f936b7fc"
SRC_URI[pro.sha256sum] = "b7f5105c75018b1cbf94432e10e6108f4cd9fc2ae8a4cd025b36e0669ed9f97d"

S = "${WORKDIR}/qcustomplot-source"

inherit qmake5

do_configure_prepend() {
    cp ${WORKDIR}/qcustomplot-sharedlib/sharedlib-compilation/sharedlib-compilation.pro ${S}
    sed -i 's:../../qcustomplot:qcustomplot:g' ${S}/sharedlib-compilation.pro
}

do_install() {
    install -d ${D}${libdir}
    cp -d ${B}/libqcustomplot.so* ${D}${libdir}

    install -d ${D}${libdir}/pkgconfig
    install -m 0644 ${WORKDIR}/qcustomplot-qt5.pc ${D}${libdir}/pkgconfig/
    sed -i \
        -e 's:%libdir%:${libdir}:g' \
        -e 's:%includedir%:${includedir}:g' \
        ${D}${libdir}/pkgconfig/qcustomplot-qt5.pc

    install -d ${D}${includedir}
    install -m 0644 ${S}/qcustomplot.h ${D}${includedir}/
}

