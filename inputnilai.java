Scanner SC = new Scanner(System.in);
        String nama, alamat, notelp, walikelas;
        int nharian, npts, nuas;

        System.out.println("inputan data siswa");
        System.out.println("inputkan nama siswa");
        nama = SC.nextLine();
        System.out.println("inputkan alamat siswa");
        alamat = SC.nextLine();
        System.out.println("inputkan nomor telp siswa");
        notelp = SC.nextLine();
        System.out.println("inputkan wali kelas siswa");
        walikelas = SC.nextLine();

        System.out.println("Inputkan nilai harian siswa");
        nharian = SC.nextInt();
        System.out.println("Inputkan nilai pts siswa");
        npts = SC.nextInt();
        System.out.println("Inputkan nilai uas siswa");
        nuas = SC.nextInt();

        int totalnilai = nharian + npts + nuas;
        double nakhir = (nharian * 0.5) + (npts * 0.2) + (nuas * 0.3);

        System.out.println("detail nilai siswa");
        System.out.println("nama siswa          :  " + nama);
        System.out.println("alamat siswa        :  " + alamat);
        System.out.println("nomor telp siswa    :  " + notelp);
        System.out.println("wali kelas siswa    :  " + walikelas);
        System.out.println("nilai harian siswa  :  " + nharian);
        System.out.println("nilai pts siswa     :  " + npts);
        System.out.println("nilai uas siswa     :  " + nuas);
        System.out.println("nilai total siswa   :  " + totalnilai);
        System.out.println("nilai akhir siswa   :  " + nakhir);
    }