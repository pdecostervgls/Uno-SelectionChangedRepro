using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using System.Text;
using Windows.UI.Xaml.Controls;

namespace SelectionChangedRepro.ViewModels
{
    public class MainViewModel : INotifyPropertyChanged
    {
        private void NotifyPropertyChanged([CallerMemberName] String propertyName = "")
        {
            PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
        }
        public event PropertyChangedEventHandler PropertyChanged;

        private ListViewItem _ChosenItem;
        public ListViewItem ChosenItem
        {
            get
            {
                return _ChosenItem;
            }
            set
            {
                if (_ChosenItem != value)
                {
                    _ChosenItem = value;
                    NotifyPropertyChanged();
                }
            }
        }
    }
}
